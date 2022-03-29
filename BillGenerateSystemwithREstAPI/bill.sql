-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2022 at 11:24 AM
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
-- Database: `bill`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `billid` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `name_name` varchar(255) DEFAULT NULL,
  `pname_pid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`billid`, `price`, `name_name`, `pname_pid`) VALUES
(1, 500000, 'Daksh', 102),
(2, 550000, 'Lakshya', 101),
(3, 1000000, 'Mukul', 103),
(4, 6500000, 'Mukul Shakya', 104),
(5, 750000, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(255) NOT NULL,
  `cid` int(11) NOT NULL,
  `hometown` varchar(255) DEFAULT NULL,
  `phone` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `cid`, `hometown`, `phone`) VALUES
('Daksh', 2, 'MuzaffarNagar', 8979098567),
('Lakshya', 1, 'Mathura', 9897050505),
('Mukul', 3, 'Agra', 9897010011),
('Mukul Shakya', 4, 'Agra', 9557000000),
('Shoumit', 5, 'Patna', 7417456789);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pid` int(11) NOT NULL,
  `pname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `pname`) VALUES
(101, 'Train'),
(102, 'Aachar'),
(103, 'Laptop'),
(104, 'Mobile'),
(105, 'Ac');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billid`),
  ADD KEY `FKb9cxnswo0xxiunn5vfoeyu7y8` (`name_name`),
  ADD KEY `FKex0iuncprvdycjeor1un5duca` (`pname_pid`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `FKb9cxnswo0xxiunn5vfoeyu7y8` FOREIGN KEY (`name_name`) REFERENCES `customer` (`name`),
  ADD CONSTRAINT `FKex0iuncprvdycjeor1un5duca` FOREIGN KEY (`pname_pid`) REFERENCES `product` (`pid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
