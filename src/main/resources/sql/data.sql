-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.16 - MySQL Community Server - GPL
-- 服务器OS:                        Win64
-- HeidiSQL 版本:                  10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for ooap
DROP DATABASE IF EXISTS `ooap`;
CREATE DATABASE IF NOT EXISTS `ooap` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ooap`;

-- Dumping structure for table ooap.administrator
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE IF NOT EXISTS `administrator` (
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.administrator: ~0 rows (大约)
DELETE FROM `administrator`;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
INSERT INTO `administrator` (`email`, `password`) VALUES
	('a@qq.com', '123');
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;

-- Dumping structure for table ooap.article
DROP TABLE IF EXISTS `article`;
CREATE TABLE IF NOT EXISTS `article` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) DEFAULT NULL,
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `highlight` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `abstracts` varchar(999) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL,
  `file_name` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `file_path` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `subject` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ip` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.article: ~6 rows (大约)
DELETE FROM `article`;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` (`aid`, `sid`, `title`, `highlight`, `abstracts`, `author`, `time`, `file_name`, `file_path`, `subject`, `ip`) VALUES
	(1, 18, 'a', 'b', 'c', 'd', '2020-12-10 21:12:07', 'e', 'e', 'b', '1'),
	(8, 19, 'b', NULL, NULL, NULL, '2020-12-12 10:10:44', NULL, NULL, NULL, NULL),
	(9, 20, 'c', NULL, NULL, NULL, '2020-12-12 10:10:45', NULL, NULL, NULL, NULL),
	(10, 21, 'd', NULL, NULL, NULL, '2020-12-12 10:10:46', NULL, NULL, NULL, NULL),
	(11, 21, NULL, NULL, NULL, NULL, '2020-12-12 10:10:47', NULL, NULL, NULL, NULL),
	(12, 20, NULL, NULL, NULL, NULL, '2020-12-12 10:16:09', NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `article` ENABLE KEYS */;

-- Dumping structure for table ooap.author
DROP TABLE IF EXISTS `author`;
CREATE TABLE IF NOT EXISTS `author` (
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.author: ~0 rows (大约)
DELETE FROM `author`;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
/*!40000 ALTER TABLE `author` ENABLE KEYS */;

-- Dumping structure for table ooap.block_author
DROP TABLE IF EXISTS `block_author`;
CREATE TABLE IF NOT EXISTS `block_author` (
  `id` int(11) NOT NULL,
  `email` varchar(20) NOT NULL,
  `ip` varchar(30) CHARACTER SET utf8 COLLATE utf8_german2_ci DEFAULT NULL,
  `blockuntil` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.block_author: ~0 rows (大约)
DELETE FROM `block_author`;
/*!40000 ALTER TABLE `block_author` DISABLE KEYS */;
/*!40000 ALTER TABLE `block_author` ENABLE KEYS */;

-- Dumping structure for table ooap.comments
DROP TABLE IF EXISTS `comments`;
CREATE TABLE IF NOT EXISTS `comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(30) DEFAULT NULL,
  `comment` varchar(50) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user` varchar(20) DEFAULT NULL,
  `hide` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ip` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.comments: ~0 rows (大约)
DELETE FROM `comments`;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;

-- Dumping structure for table ooap.love_article
DROP TABLE IF EXISTS `love_article`;
CREATE TABLE IF NOT EXISTS `love_article` (
  `ip` varchar(20) DEFAULT NULL,
  `title` varchar(30) DEFAULT NULL,
  `prefer` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.love_article: ~0 rows (大约)
DELETE FROM `love_article`;
/*!40000 ALTER TABLE `love_article` DISABLE KEYS */;
/*!40000 ALTER TABLE `love_article` ENABLE KEYS */;

-- Dumping structure for table ooap.love_comment
DROP TABLE IF EXISTS `love_comment`;
CREATE TABLE IF NOT EXISTS `love_comment` (
  `ip` varchar(20) DEFAULT NULL,
  `cid` int(11) NOT NULL,
  `prefer` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.love_comment: ~0 rows (大约)
DELETE FROM `love_comment`;
/*!40000 ALTER TABLE `love_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `love_comment` ENABLE KEYS */;

-- Dumping structure for table ooap.subject
DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `root_subject` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `creator_email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.subject: ~6 rows (大约)
DELETE FROM `subject`;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` (`id`, `root_subject`, `date`, `creator_email`) VALUES
	(18, 'Computer Science', '2020-12-10 22:19:03', 'a@qq.com'),
	(19, 'Medical Science', '2020-12-10 22:19:37', 'a@qq.com'),
	(20, 'Social Science', '2020-12-10 22:20:20', 'a@qq.com'),
	(21, 'Biological Science', '2020-12-10 22:29:04', 'a@qq.com'),
	(22, 'Mathematics', '2020-12-10 22:29:06', 'a@qq.com');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;

-- Dumping structure for table ooap.sub_subject
DROP TABLE IF EXISTS `sub_subject`;
CREATE TABLE IF NOT EXISTS `sub_subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `root_subject` varchar(30) NOT NULL DEFAULT '0',
  `sub_subject` varchar(30) NOT NULL DEFAULT '0',
  `created_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `creator_email` varchar(30) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.sub_subject: ~5 rows (大约)
DELETE FROM `sub_subject`;
/*!40000 ALTER TABLE `sub_subject` DISABLE KEYS */;
INSERT INTO `sub_subject` (`id`, `root_subject`, `sub_subject`, `created_date`, `creator_email`) VALUES
	(1, 'Computer Science', 'Software Engineer', '2020-12-12 10:42:59', 'a@qq.com'),
	(2, 'Medical Science', '0', '2020-12-12 10:43:00', 'a@qq.com'),
	(3, 'Social Science', '0', '2020-12-12 10:43:02', 'a@qq.com'),
	(4, 'Biological Science', '0', '2020-12-12 10:42:54', 'a@qq.com'),
	(5, 'Mathematics', '0', '2020-12-12 10:43:04', 'a@qq.com');
/*!40000 ALTER TABLE `sub_subject` ENABLE KEYS */;

-- Dumping structure for table ooap.visit
DROP TABLE IF EXISTS `visit`;
CREATE TABLE IF NOT EXISTS `visit` (
  `vid` int(11) NOT NULL AUTO_INCREMENT,
  `aid` int(11) DEFAULT NULL,
  `ip` varchar(30) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`vid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table ooap.visit: ~0 rows (大约)
DELETE FROM `visit`;
/*!40000 ALTER TABLE `visit` DISABLE KEYS */;
/*!40000 ALTER TABLE `visit` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
