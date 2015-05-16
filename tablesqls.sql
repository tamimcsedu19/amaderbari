CREATE TABLE `CountryColumnMapper` (
 `Country` varchar(10) NOT NULL,
 `Column1` varchar(10) NOT NULL,
 `Column2` varchar(10) NOT NULL,
 PRIMARY KEY (`Country`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This Maps a table into country'

CREATE TABLE `BangladeshAddress` (
 `Division` varchar(10) NOT NULL,
 `City` varchar(10) NOT NULL,
 `FlatID` varchar(10) NOT NULL,
 PRIMARY KEY (`Division`,`City`,`FlatID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `Users` (
 `email` varchar(25) NOT NULL,
 `first_name` varchar(25) NOT NULL,
 `last_name` varchar(25) NOT NULL,
 `password` varchar(25) NOT NULL,
 `national_id` varchar(30) DEFAULT NULL,
 `contact_no` varchar(15) DEFAULT NULL,
 `relegion` varchar(10) DEFAULT NULL,
 `occupation` varchar(10) DEFAULT NULL,
 PRIMARY KEY (`email`),
 UNIQUE KEY `national_id` (`national_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Table of All Users'

INSERT INTO `ratajo`.`BangladeshAddress` (`Division`, `City`, `FlatID`) VALUES ('Dhaka', 'Uttara', '12111');
