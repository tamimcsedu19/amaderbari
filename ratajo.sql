-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 29, 2015 at 05:25 PM
-- Server version: 5.5.43-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ratajo`
--

-- --------------------------------------------------------

--
-- Table structure for table `Addresses`
--

CREATE TABLE IF NOT EXISTS `Addresses` (
  `AddressId` int(15) NOT NULL AUTO_INCREMENT,
  `LabelId` int(15) NOT NULL,
  `Country` varchar(15) NOT NULL,
  `AddressArgument1` varchar(15) NOT NULL,
  `AddressArgument2` varchar(15) NOT NULL,
  `ExtraAddressArgument` varchar(100) CHARACTER SET armscii8 DEFAULT NULL,
  PRIMARY KEY (`AddressId`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COMMENT='This Maps a table into country' AUTO_INCREMENT=6 ;

--
-- Dumping data for table `Addresses`
--

INSERT INTO `Addresses` (`AddressId`, `LabelId`, `Country`, `AddressArgument1`, `AddressArgument2`, `ExtraAddressArgument`) VALUES
(1, 0, 'Bangladesh', 'Dhaka', 'Dhaka', NULL),
(2, 0, 'Bangladesh', 'Dhaka', 'Dhaka', NULL),
(3, 0, 'Bangladesh', 'Dhaka', 'Uttara', NULL),
(4, 0, 'Bangladesh', 'Dhaka', 'Uttara', NULL),
(5, 0, 'Bangladesh', 'Dhaka', 'Dhaka', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `AddressLabels`
--

CREATE TABLE IF NOT EXISTS `AddressLabels` (
  `LabelId` int(15) NOT NULL AUTO_INCREMENT,
  `Country` varchar(15) NOT NULL,
  `AddressArgument1` varchar(15) NOT NULL,
  `AddressArgument2` varchar(15) CHARACTER SET armscii8 NOT NULL,
  `ExtraAddressArgument` varchar(100) CHARACTER SET armscii8 NOT NULL,
  PRIMARY KEY (`LabelId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `Flats`
--

CREATE TABLE IF NOT EXISTS `Flats` (
  `FlatID` int(15) NOT NULL AUTO_INCREMENT,
  `AddressId` varchar(20) CHARACTER SET ascii DEFAULT NULL,
  `ExtraFlatDataId` int(15) NOT NULL,
  `ImageId` int(15) NOT NULL,
  `OwnerEmail` varchar(50) NOT NULL,
  `RenterEmail` varchar(50) CHARACTER SET ascii DEFAULT NULL,
  `MapUrl` varchar(50) CHARACTER SET ascii DEFAULT NULL,
  `SquareFoot` varchar(10) CHARACTER SET big5 NOT NULL,
  `Rent` float NOT NULL,
  PRIMARY KEY (`FlatID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `Flats`
--

INSERT INTO `Flats` (`FlatID`, `AddressId`, `ExtraFlatDataId`, `ImageId`, `OwnerEmail`, `RenterEmail`, `MapUrl`, `SquareFoot`, `Rent`) VALUES
(3, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(4, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(5, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(6, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(7, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(8, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(9, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(10, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(11, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(12, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(13, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(14, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(15, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(16, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(17, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(18, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 0),
(19, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(20, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(21, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(22, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 1200.5),
(23, '0', 0, 0, 'abc@gmail.com', 'def@gmail.com', '', '1200*1200', 100.24);

-- --------------------------------------------------------

--
-- Table structure for table `Images`
--

CREATE TABLE IF NOT EXISTS `Images` (
  `ImageId` int(15) NOT NULL AUTO_INCREMENT,
  `ImageUrl1` varchar(50) NOT NULL,
  `ImageUrl2` varchar(50) NOT NULL,
  `ImageUrl3` varchar(50) NOT NULL,
  `ImageUrl4` varchar(50) NOT NULL,
  `ImageUrl5` varchar(50) NOT NULL,
  PRIMARY KEY (`ImageId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE IF NOT EXISTS `Users` (
  `email` varchar(50) NOT NULL,
  `first_name` varchar(25) NOT NULL,
  `last_name` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `national_id` varchar(30) DEFAULT NULL,
  `contact_no` varchar(15) DEFAULT NULL,
  `religion` varchar(10) DEFAULT NULL,
  `occupation` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`email`),
  UNIQUE KEY `national_id` (`national_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='Table of All Users';

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`email`, `first_name`, `last_name`, `password`, `national_id`, `contact_no`, `religion`, `occupation`) VALUES
('jony.du.12.12.12@gmail.com', 'tamim', 'addari', 'addari', NULL, NULL, NULL, NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
