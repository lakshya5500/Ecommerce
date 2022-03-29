-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2022 at 11:09 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `carrent`
--

-- --------------------------------------------------------

--
-- Table structure for table `car`
--

CREATE TABLE `car` (
  `regno` int(11) NOT NULL,
  `modelname` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `car`
--

INSERT INTO `car` (`regno`, `modelname`, `year`) VALUES
(1001, 'swift', '2011'),
(1002, 'innova', '2016'),
(1003, 'indica', '2018'),
(1004, 'audi', '2020');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `cid` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `car_regno` int(11) DEFAULT NULL,
  `rent_fee` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`cid`, `address`, `mobile`, `name`, `car_regno`, `rent_fee`) VALUES
(12345, 'walkingtree tech agra', 745745745, 'lakshya', 1002, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `fee` int(11) NOT NULL,
  `due` varchar(255) DEFAULT NULL,
  `regno_regno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`fee`, `due`, `regno_regno`) VALUES
(4000, '1 months', 1001),
(5000, '1 months', 1002);

-- --------------------------------------------------------

--
-- Table structure for table `station`
--

CREATE TABLE `station` (
  `sid` int(11) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `regno_regno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `car`
--
ALTER TABLE `car`
  ADD PRIMARY KEY (`regno`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cid`),
  ADD KEY `FKnboifakdfyv2gn46fgbnk5d7t` (`car_regno`),
  ADD KEY `FKoavkluie5r1ahhs1cmi76rsiu` (`rent_fee`);

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`fee`),
  ADD KEY `FKrvmw8qv5jp1jpl9yam72ec2ld` (`regno_regno`);

--
-- Indexes for table `station`
--
ALTER TABLE `station`
  ADD PRIMARY KEY (`sid`),
  ADD KEY `FKdkdj0lnovt7ym07ovc6w8wddu` (`regno_regno`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `FKnboifakdfyv2gn46fgbnk5d7t` FOREIGN KEY (`car_regno`) REFERENCES `car` (`regno`),
  ADD CONSTRAINT `FKoavkluie5r1ahhs1cmi76rsiu` FOREIGN KEY (`rent_fee`) REFERENCES `rental` (`fee`);

--
-- Constraints for table `rental`
--
ALTER TABLE `rental`
  ADD CONSTRAINT `FKrvmw8qv5jp1jpl9yam72ec2ld` FOREIGN KEY (`regno_regno`) REFERENCES `car` (`regno`);

--
-- Constraints for table `station`
--
ALTER TABLE `station`
  ADD CONSTRAINT `FKdkdj0lnovt7ym07ovc6w8wddu` FOREIGN KEY (`regno_regno`) REFERENCES `car` (`regno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
