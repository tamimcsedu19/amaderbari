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


INSERT INTO `ratajo`.`BangladeshAddress` (`Division`, `City`, `FlatID`) VALUES ('Dhaka', 'Uttara', '12111');
