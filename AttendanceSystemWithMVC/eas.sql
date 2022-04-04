-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2022 at 08:26 AM
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
-- Database: `eas`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `aid` int(11) NOT NULL,
  `absents` int(11) NOT NULL,
  `workingday` int(11) NOT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `halfday` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`aid`, `absents`, `workingday`, `employee_id`, `halfday`) VALUES
(1, 0, 0, 107, 0),
(2, 0, 0, 109, 0),
(3, 0, 0, 110, 0),
(4, 0, 0, 111, 0),
(5, 0, 0, 101, 0),
(6, 0, 0, 102, 0),
(7, 0, 0, 103, 0),
(8, 0, 3, 104, 1),
(9, 0, 0, 105, 0),
(10, 0, 0, 106, 0),
(11, 0, 0, 108, 0),
(12, 0, 0, 112, 0),
(13, 0, 0, 113, 0),
(14, 0, 0, 114, 0),
(15, 0, 0, 115, 0),
(16, 0, 0, 116, 0),
(17, 0, 0, 117, 0),
(18, 0, 0, 118, 0),
(19, 0, 0, 119, 0),
(20, 0, 0, 120, 0),
(21, 0, 0, 121, 0),
(22, 0, 0, 122, 0),
(23, 0, 0, 123, 0);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `departmant` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `departmant`, `name`) VALUES
(101, 'TASE', 'KumarShoumit'),
(102, 'TASE', 'AlokKumar'),
(103, 'TASE', 'MukulShakya'),
(104, 'TASE', 'LakshyaSoni'),
(105, 'TASE', 'DakshNamdev'),
(106, 'TASE', 'MukulChahar'),
(107, 'TASE', 'RajatChaurasia'),
(108, 'TASE', 'RajeshSrivastava'),
(109, 'TASE', 'HimanshuBhadauria'),
(110, 'TASE', 'DhruvSingh'),
(111, 'TASE', 'AnkitBhadauria'),
(112, 'TASE', 'ShivamVerma'),
(113, 'TASE', 'AmaidAnwar'),
(114, 'TASE', 'AshishGupta'),
(115, 'TASE', 'AkashRajput'),
(116, 'TASE', 'VaibhavJain'),
(117, 'TASE', 'ShivaAmoria'),
(118, 'TASE', 'AbhaySingh'),
(119, 'TASE', 'RamakantUpadhayay'),
(120, 'TASE', 'KishanTyagi'),
(121, 'TASE', 'ShivamSharma'),
(122, 'TASE', 'SamtaPoddar'),
(123, 'TASE', 'ShivaniSingh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aid`),
  ADD KEY `FKfqvq6sji8mt41k0qtwvhv731r` (`employee_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `aid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `FKfqvq6sji8mt41k0qtwvhv731r` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
