SET
SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET
AUTOCOMMIT = 0;
START TRANSACTION;
SET
time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospital`
--
CREATE
DATABASE IF NOT EXISTS `hospital` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE
`hospital`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente`
(
    `num_seg_soc`   varchar(12) NOT NULL,
    `nombre`        varchar(25) NOT NULL,
    `total_visitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `visita`
--

CREATE TABLE `visita`
(
    `id_visita`    varchar(15)  NOT NULL,
    `num_paciente` varchar(12)  NOT NULL,
    `motivo`       varchar(100) NOT NULL,
    `medico`       varchar(30)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
    ADD PRIMARY KEY (`num_seg_soc`);

--
-- Indices de la tabla `visita`
--
ALTER TABLE `visita`
    ADD PRIMARY KEY (`id_visita`),
  ADD KEY `paciente` (`num_paciente`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `visita`
--
ALTER TABLE `visita`
    ADD CONSTRAINT `paciente` FOREIGN KEY (`num_paciente`) REFERENCES `paciente` (`num_seg_soc`);
COMMIT;

INSERT INTO `paciente` (`num_seg_soc`, `nombre`, `total_visitas`)
VALUES ('AA', 'Paciente de Pruebas', 0),
       ('BB', 'Paciente Segundo', 0),
       ('EE', 'Lorena López', 3),
       ('CC', 'Eva Lizama', 1),
       ('DD', 'Juan Salinas', 2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

CREATE
USER 'examen'@'localhost' IDENTIFIED BY 'examen';
GRANT ALL PRIVILEGES ON *.* TO
'examen'@'localhost';
