CREATE TABLE `report_histories` (
    `id` int NOT NULL AUTO_INCREMENT,
    `market` varchar(45) NOT NULL,
    `price` varchar(45) NOT NULL,
    `reported_at` datetime NOT NULL,
    PRIMARY KEY (`id`)
)