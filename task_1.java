@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Ожидается, что пользователю больше 18 лет", Boolean.TRUE, isAdult); // Напиши код здесь
        }