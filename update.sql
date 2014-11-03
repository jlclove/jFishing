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