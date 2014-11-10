ALTER TABLE `gudlike_fishing`.`t_point` 
CHANGE COLUMN `latitude` `latitude` DOUBLE NOT NULL DEFAULT NULL COMMENT '纬度' ,
CHANGE COLUMN `longitude` `longitude` DOUBLE NOT NULL DEFAULT NULL COMMENT '经度' ;


CREATE 
    ALGORITHM = MERGE 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `v_pointwithtype` AS
    SELECT 
        `a`.`id` AS `id`,
        `a`.`typeId` AS `typeId`,
        `a`.`remark` AS `remark`,
        `a`.`createTime` AS `createTime`,
        `a`.`creator` AS `creator`,
        `a`.`updateTime` AS `updateTime`,
        `a`.`updator` AS `updator`,
        `a`.`latitude` AS `latitude`,
        `a`.`longitude` AS `longitude`,
        `b`.`typeName` AS `typeName`
    FROM
        (`t_point` `a`
        JOIN `t_point_type` `b` ON ((`a`.`typeId` = `b`.`id`)))
        
        
        
------------  2014-11-10   ------ 
ALTER TABLE `gudlike_fishing`.`t_point` 
ADD COLUMN `waterDeep` INT NOT NULL COMMENT '钓鱼水深',
ADD COLUMN `price` INT NOT NULL DEFAULT 0 COMMENT '钓鱼费用' ,
ADD COLUMN `unit` VARCHAR(30) NOT NULL COMMENT '钓鱼费用单位' ,
ADD COLUMN `nightFish` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '是否可以夜钓' ,
ADD COLUMN `easyPark` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '是否方便停车' 

INSERT INTO `gudlike_fishing`.`t_fish` (`fishName`, `remark`) VALUES ('桂鱼', '很好吃的鱼');
INSERT INTO `gudlike_fishing`.`t_fish` (`fishName`, `remark`) VALUES ('鲶鱼', '水煮用比较多');

