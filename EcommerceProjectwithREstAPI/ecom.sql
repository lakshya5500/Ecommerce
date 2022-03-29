-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2022 at 02:19 PM
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
-- Database: `ecom`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `bill_id` int(11) NOT NULL,
  `bill` int(11) NOT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `product_pid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`bill_id`, `bill`, `customer_name`, `product_pid`) VALUES
(1, 80000, 'Daksha Namdev', 4),
(2, 50000, 'Daksha Namdev', 1),
(3, 35000, 'mukul', 3);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `subcat` varchar(255) NOT NULL,
  `cat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`subcat`, `cat`) VALUES
('ac', 'electronics'),
('laptop', 'electronics'),
('mobile', 'electronic');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(255) NOT NULL,
  `hometown` varchar(255) DEFAULT NULL,
  `phone_no` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `hometown`, `phone_no`) VALUES
('Daksha Namdev', 'muzaffarnagar', 945678521),
('mukul', 'agra', 95547645);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pid` int(11) NOT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `category_subcat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `pname`, `price`, `category_subcat`) VALUES
(1, 'samsung', '50000', 'mobile'),
(2, 'voltas', '32000', 'ac'),
(3, 'hp', '35000', 'laptop'),
(4, 'apple', '80000', 'mobile'),
(5, 'oppo', '35000', 'mobile'),
(6, 'mi', '20000', 'mobile'),
(7, 'sony', '25000', 'mobile'),
(8, 'realme', '15000', 'mobile'),
(9, 'vivo', '35000', 'mobile'),
(10, 'motorola', '30000', 'mobile'),
(11, 'micromax', '10000', 'mobile'),
(12, 'lg', '33000', 'ac'),
(13, 'whirlpool', '22000', 'ac'),
(14, 'samsung', '30000', 'ac'),
(15, 'daikin', '40000', 'ac'),
(16, 'bluestar', '28000', 'ac'),
(17, 'hitachi', '25000', 'ac'),
(18, 'samsung', '50000', 'laptop'),
(19, 'macbook', '120000', 'laptop'),
(20, 'lenovo', '44000', 'laptop'),
(21, 'asus', '30000', 'laptop'),
(22, 'lg', '25000', 'laptop'),
(23, 'dell', '30000', 'laptop'),
(24, 'acer', '25000', 'laptop'),
(25, 'iball', '35000', 'laptop');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `FKs3wxvaxde8tc9j1nuh4xy07ux` (`customer_name`),
  ADD KEY `FKf4ffgvnpoaus5l1grg2ai8m7e` (`product_pid`);

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
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `FK1ukxbny12s92kuvdvl8qrkob6` (`category_subcat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `bill_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `FKf4ffgvnpoaus5l1grg2ai8m7e` FOREIGN KEY (`product_pid`) REFERENCES `product` (`pid`),
  ADD CONSTRAINT `FKs3wxvaxde8tc9j1nuh4xy07ux` FOREIGN KEY (`customer_name`) REFERENCES `customer` (`name`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK1ukxbny12s92kuvdvl8qrkob6` FOREIGN KEY (`category_subcat`) REFERENCES `category` (`subcat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
