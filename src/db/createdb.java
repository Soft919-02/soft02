package db;

public final class createdb {
    private static final String[] strings =
            {"CREATE SCHEMA IF NOT EXISTS `spmdb` DEFAULT CHARACTER SET utf8 ;",

            "CREATE TABLE IF NOT EXISTS `spmdb`.`teacher` (\n" +
            "  `tid` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `account` VARCHAR(20) NULL,\n" +
            "  `password` VARCHAR(20) NULL,\n" +
            "  PRIMARY KEY (`tid`))\n" +
            "ENGINE = InnoDB;",

            "CREATE TABLE IF NOT EXISTS `spmdb`.`room` (\n" +
            "  `rid` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `name` VARCHAR(20) NULL,\n" +
            "  `type` VARCHAR(10) NULL,\n" +
            "  `seat` VARCHAR(50) NULL,\n" +
            "  PRIMARY KEY (`rid`))\n" +
            "ENGINE = InnoDB;",

            "CREATE TABLE IF NOT EXISTS `spmdb`.`student` (\n" +
            "  `sid` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `account` VARCHAR(20) NULL,\n" +
            "  `password` VARCHAR(20) NULL,\n" +
            "  `clas` VARCHAR(10) NULL,\n" +
            "  PRIMARY KEY (`sid`))\n" +
            "ENGINE = InnoDB;",

            "CREATE TABLE IF NOT EXISTS `spmdb`.`experiment` (\n" +
            "  `eid` INT NOT NULL AUTO_INCREMENT,\n" +
            "  `tid` INT NOT NULL,\n" +
            "  `rid` INT NOT NULL,\n" +
            "  `name` VARCHAR(10) NULL,\n" +
            "  `subject` VARCHAR(10) NULL,\n" +
            "  `time` VARCHAR(20) NULL,\n" +
            "  `studyTime` INT NULL,\n" +
            "  `seat` VARCHAR(50) NULL,\n" +
            "  `isShared` TINYINT NULL,\n" +
            "  `phone` VARCHAR(15) NULL,\n" +
            "  PRIMARY KEY (`eid`),\n" +
            "  INDEX `fk_experiment_teacher_idx` (`tid` ASC) VISIBLE,\n" +
            "  INDEX `fk_experiment_room1_idx` (`rid` ASC) VISIBLE,\n" +
            "  CONSTRAINT `fk_experiment_teacher`\n" +
            "    FOREIGN KEY (`tid`)\n" +
            "    REFERENCES `spmdb`.`teacher` (`tid`)\n" +
            "    ON DELETE NO ACTION\n" +
            "    ON UPDATE NO ACTION,\n" +
            "  CONSTRAINT `fk_experiment_room1`\n" +
            "    FOREIGN KEY (`rid`)\n" +
            "    REFERENCES `spmdb`.`room` (`rid`)\n" +
            "    ON DELETE NO ACTION\n" +
            "    ON UPDATE NO ACTION)\n" +
            "ENGINE = InnoDB\n" +
            "DEFAULT CHARACTER SET = big5;",

            "CREATE TABLE IF NOT EXISTS `spmdb`.`student_has_experiment` (\n" +
            "  `student_sid` INT NOT NULL,\n" +
            "  `experiment_eid` INT NOT NULL,\n" +
            "  `seat` INT NULL,\n" +
            "  PRIMARY KEY (`student_sid`, `experiment_eid`),\n" +
            "  INDEX `fk_student_has_experiment_experiment1_idx` (`experiment_eid` ASC) VISIBLE,\n" +
            "  INDEX `fk_student_has_experiment_student1_idx` (`student_sid` ASC) VISIBLE,\n" +
            "  CONSTRAINT `fk_student_has_experiment_student1`\n" +
            "    FOREIGN KEY (`student_sid`)\n" +
            "    REFERENCES `spmdb`.`student` (`sid`)\n" +
            "    ON DELETE NO ACTION\n" +
            "    ON UPDATE NO ACTION,\n" +
            "  CONSTRAINT `fk_student_has_experiment_experiment1`\n" +
            "    FOREIGN KEY (`experiment_eid`)\n" +
            "    REFERENCES `spmdb`.`experiment` (`eid`)\n" +
            "    ON DELETE NO ACTION\n" +
            "    ON UPDATE NO ACTION)\n" +
            "ENGINE = InnoDB;",

            "CREATE TABLE IF NOT EXISTS `spmdb`.`administer` (\n" +
            "  `account` VARCHAR(20) NULL,\n" +
            "  `password` VARCHAR(20) NULL)\n" +
            "ENGINE = InnoDB;"};

    public static String str(int i){
        return strings[i];
    }
    public static int length(){
        return strings.length;
    }
}
