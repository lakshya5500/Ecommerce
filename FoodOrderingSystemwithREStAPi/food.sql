-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2022 at 12:45 PM
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
-- Database: `food`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `billid` int(11) NOT NULL,
  `bill` int(11) NOT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `item_iid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`billid`, `bill`, `customer_name`, `item_iid`) VALUES
(1, 500, 'Mukul', 1),
(2, 110, 'Aman', 4),
(3, 110, 'Aman', 4),
(4, 50, 'daksh', 3);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `subcat` varchar(255) NOT NULL,
  `cat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`subcat`, `cat`) VALUES
('nonveg', 'food'),
('northindia', 'food'),
('southindian', 'food'),
('veg', 'food');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `mobile` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `address`, `mobile`) VALUES
('Aayush', 'Muzaffarnagar', 963852741),
('Aman', 'Delhi', 741258963),
('daksh', 'Muzaffarnagar', 989704575),
('kaku', 'Mathura', 852369741),
('lakshya', 'Mathura', 981234586),
('Mukul', 'Agra', 989705505),
('Rajat', 'Delhi', 741258963),
('shakya', 'Agra', 985632147);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `iid` int(11) NOT NULL,
  `iname` varchar(255) DEFAULT NULL,
  `iprice` varchar(255) DEFAULT NULL,
  `category_subcat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`iid`, `iname`, `iprice`, `category_subcat`) VALUES
(1, 'Dal', '90', 'veg'),
(2, 'Chiken', '150', 'nonveg'),
(3, 'Masala Dosa', '50', 'southindian'),
(4, 'MixVeg', '110', 'veg'),
(5, 'Idli', '60', 'southindian'),
(6, 'mutton', '160', 'nonveg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`billid`),
  ADD KEY `FKs3wxvaxde8tc9j1nuh4xy07ux` (`customer_name`),
  ADD KEY `FKfbbluieyhac700w80x17uxfcw` (`item_iid`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`subcat`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`iid`),
  ADD KEY `FKbl51d4xltitvqm3xtagjbg5tb` (`category_subcat`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `FKfbbluieyhac700w80x17uxfcw` FOREIGN KEY (`item_iid`) REFERENCES `item` (`iid`),
  ADD CONSTRAINT `FKs3wxvaxde8tc9j1nuh4xy07ux` FOREIGN KEY (`customer_name`) REFERENCES `customer` (`name`);

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `FKbl51d4xltitvqm3xtagjbg5tb` FOREIGN KEY (`category_subcat`) REFERENCES `category` (`subcat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
