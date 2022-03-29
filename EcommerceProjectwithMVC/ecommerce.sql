-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 23, 2022 at 01:05 PM
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
-- Database: `ecommerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `subcat` varchar(255) NOT NULL,
  `cat` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`subcat`, `cat`) VALUES
('ac', 'electronics'),
('laptop', 'electronics'),
('mobile', 'electronics');

-- --------------------------------------------------------

--
-- Table structure for table `category_category`
--

CREATE TABLE `category_category` (
  `category_subcat` varchar(255) NOT NULL,
  `p_name` varchar(25) DEFAULT NULL,
  `p_price` double NOT NULL,
  `p_id` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category_category`
--

INSERT INTO `category_category` (`category_subcat`, `p_name`, `p_price`, `p_id`) VALUES
('mobile', 'samsung', 50000, 1),
('ac', 'voltas', 32000, 2),
('laptop', 'hp', 35000, 3),
('mobile', 'apple', 80000, 4),
('mobile', 'oppo', 35000, 5),
('mobile', 'mi', 20000, 6),
('mobile', 'sony', 25000, 7),
('mobile', 'realme', 15000, 8),
('mobile', 'vivo', 35000, 9),
('mobile', 'motorola', 30000, 10),
('mobile', 'micromax', 10000, 11),
('ac', 'lg', 33000, 12),
('ac', 'whirlpool', 22000, 13),
('ac', 'samsung', 30000, 14),
('ac', 'daikin', 40000, 15),
('ac', 'bluestar', 28000, 16),
('ac', 'hitachi', 25000, 17),
('laptop', 'samsung', 50000, 18),
('laptop', 'macbook', 120000, 19),
('laptop', 'lenovo', 44000, 20),
('laptop', 'asus', 30000, 21),
('laptop', 'lg', 25000, 22),
('laptop', 'dell', 30000, 23),
('laptop', 'acer', 25000, 24),
('laptop', 'iball', 35000, 25);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`subcat`);

--
-- Indexes for table `category_category`
--
ALTER TABLE `category_category`
  ADD PRIMARY KEY (`p_id`),
  ADD KEY `FKnn8ee7txqqb1c5ygxeuujpfme` (`category_subcat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category_category`
--
ALTER TABLE `category_category`
  MODIFY `p_id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `category_category`
--
ALTER TABLE `category_category`
  ADD CONSTRAINT `FKnn8ee7txqqb1c5ygxeuujpfme` FOREIGN KEY (`category_subcat`) REFERENCES `category` (`subcat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
