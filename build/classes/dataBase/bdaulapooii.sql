-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Set-2022 às 03:14
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bdaulapooii`
--
CREATE DATABASE IF NOT EXISTS `bdaulapooii` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bdaulapooii`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpontos`
--

DROP TABLE IF EXISTS `tbpontos`;
CREATE TABLE IF NOT EXISTS `tbpontos` (
  `idPonto` int(11) NOT NULL AUTO_INCREMENT,
  `nomePonto` varchar(255) DEFAULT NULL,
  `ruaPonto` varchar(200) DEFAULT NULL,
  `numeroPonto` int(11) DEFAULT NULL,
  `cidadePonto` varchar(100) DEFAULT NULL,
  `estadoPonto` varchar(255) DEFAULT NULL,
  `contatoPonto` varchar(100) DEFAULT NULL,
  `descricaoPonto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idPonto`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbpontos`
--

INSERT INTO `tbpontos` (`idPonto`, `nomePonto`, `ruaPonto`, `numeroPonto`, `cidadePonto`, `estadoPonto`, `contatoPonto`, `descricaoPonto`) VALUES(1, 'asd', 'asd', 12, 'afawsdgf', 'asdf', 'asdf', 'asdf');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

DROP TABLE IF EXISTS `tbusuario`;
CREATE TABLE IF NOT EXISTS `tbusuario` (
  `idUsu` int(11) NOT NULL AUTO_INCREMENT,
  `nomeUsu` varchar(255) DEFAULT NULL,
  `emailUsu` varchar(200) DEFAULT NULL,
  `senhaUsu` varchar(100) DEFAULT NULL,
  `foneUsu` varchar(100) DEFAULT NULL,
  `sexoUsu` int(11) DEFAULT NULL,
  `cepUsu` varchar(50) DEFAULT NULL,
  `logradouroUsu` varchar(255) DEFAULT NULL,
  `bairroUsu` varchar(255) DEFAULT NULL,
  `cidadeUsu` varchar(255) DEFAULT NULL,
  `estadoUsu` varchar(255) DEFAULT NULL,
  `numeroUsu` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUsu`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbusuario`
--

INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(1, 'A', 'a', '1', '24', 1, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(2, 'Andriele', 'an@gmail.com', '123', '(51)9 8591-3587', 2, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(3, 'Pri', 'pri', '123', '(56)5 4756-7868', 2, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(4, 'Pri', 'pri', '123', '(56)4 5656-7567', 2, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(5, 'Jef', 'jef', '123', '(54)6 4576-6575', 1, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(6, 'DFGDG', 'jef@gmail.com', '123', '(45)6 4565-7655', 3, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(7, 'tESTE', 'teste', '123', '(45)4 6457-6576', 3, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(8, 'fsfsd', 'dmfd', '123', '(57)7 7676-7676', 3, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(9, 'grtrfg ', 'dassc', '123', '(  )      -    ', 2, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(10, 'aaa', 'pri', 'a', '(55)5 5555-5555', 2, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(11, 'dfdsf', 'pri@a.cm', 'ee', '(33)3 3333-3333', 3, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `tbusuario` (`idUsu`, `nomeUsu`, `emailUsu`, `senhaUsu`, `foneUsu`, `sexoUsu`, `cepUsu`, `logradouroUsu`, `bairroUsu`, `cidadeUsu`, `estadoUsu`, `numeroUsu`) VALUES(12, 'eleirdna', 'aaaa@g.cm', '123', '(65)4 6245-4654', 2, '34536365215', 'asfgasdfg', 'alsidjfhasdf', 'afgasfdg', 'asdf', 12);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
