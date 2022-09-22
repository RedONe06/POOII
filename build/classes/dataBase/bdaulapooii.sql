-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23-Set-2022 às 00:46
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

CREATE TABLE `tbpontos` (
  `idPonto` int(11) NOT NULL,
  `nomePonto` varchar(255) DEFAULT NULL,
  `ruaPonto` varchar(200) DEFAULT NULL,
  `numeroPonto` int(11) DEFAULT NULL,
  `cidadePonto` varchar(100) DEFAULT NULL,
  `estadoPonto` varchar(255) DEFAULT NULL,
  `contatoPonto` varchar(100) DEFAULT NULL,
  `descricaoPonto` varchar(100) DEFAULT NULL,
  `cepPonto` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbpontos`
--

INSERT INTO `tbpontos` (`idPonto`, `nomePonto`, `ruaPonto`, `numeroPonto`, `cidadePonto`, `estadoPonto`, `contatoPonto`, `descricaoPonto`, `cepPonto`) VALUES(1, 'asd', 'asd', 12, 'afawsdgf', 'asdf', 'asdf', 'asdf', NULL);
INSERT INTO `tbpontos` (`idPonto`, `nomePonto`, `ruaPonto`, `numeroPonto`, `cidadePonto`, `estadoPonto`, `contatoPonto`, `descricaoPonto`, `cepPonto`) VALUES(2, 'Praça General Freitas', 'AV Sapucaia', 2000, 'Sapucaia do Sul', 'RS', '6355456546', 'Praça', NULL);
INSERT INTO `tbpontos` (`idPonto`, `nomePonto`, `ruaPonto`, `numeroPonto`, `cidadePonto`, `estadoPonto`, `contatoPonto`, `descricaoPonto`, `cepPonto`) VALUES(3, 'Cascata do Chuvisquerio', 'Estrada Geral do Chuvisqueiro', 0, 'Riozinho', 'RS', '5465454545', 'Cascata e atração turistica', NULL);
INSERT INTO `tbpontos` (`idPonto`, `nomePonto`, `ruaPonto`, `numeroPonto`, `cidadePonto`, `estadoPonto`, `contatoPonto`, `descricaoPonto`, `cepPonto`) VALUES(4, 'Sitio Recanto dos Prazeres', 'Av Justino Camboim', 5420, 'Sapucaia do Sul', 'RS', '5118464551', 'Sitio', '93200000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbusuario`
--

CREATE TABLE `tbusuario` (
  `idUsu` int(11) NOT NULL,
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
  `numeroUsu` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbpontos`
--
ALTER TABLE `tbpontos`
  ADD PRIMARY KEY (`idPonto`);

--
-- Índices para tabela `tbusuario`
--
ALTER TABLE `tbusuario`
  ADD PRIMARY KEY (`idUsu`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbpontos`
--
ALTER TABLE `tbpontos`
  MODIFY `idPonto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tbusuario`
--
ALTER TABLE `tbusuario`
  MODIFY `idUsu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
