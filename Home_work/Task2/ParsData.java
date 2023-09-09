import java.util.HashMap;

public class ParsData {

    public HashMap<String, Object> parsInputData() {

        InputData inputData = new InputData();
        String[] data = inputData.enterData();
        HashMap<String, Object> dataDic = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String string : data) {
            if (string.length() == 1) {
                if (string.equals("f") || string.equals("m")) {
                    dataDic.put("Пол", string);
                } else {
                    try {
                        throw new SexException();
                    } catch (SexException e) {
                        e.sexException(string);
                    }
                }
            } else if (string.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = string.split("\\.");
                boolean flag = true;
                if (Integer.parseInt(arrayDate[0]) < 0 || Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 || Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 || Integer.parseInt(arrayDate[2]) > 2023) {
                    try {
                        throw new DateException();
                    } catch (DateException e) {
                        e.dateException(string);
                    }
                } else {
                    if (Integer.parseInt(arrayDate[2]) %4 == 0) {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 30) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }
                    } else {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[2]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 29) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }
                    }
                    if (!flag) {
                        dataDic.put("Дата", string);
                    } else try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(string);
                    }
                }
            } else if (string.matches("[0-9]+")) {
                dataDic.put("Телефон", string);
            } else if (string.matches("[A-Za-z]+")) {
                sb.append(string + " ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(string);
                }
            }
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dataDic.put("Фамилия", fullName[0]);
            dataDic.put("Имя", fullName[1]);
            dataDic.put("Отчество", fullName[2]);
        }
        return dataDic;
    }

    public HashMap<String, Object> parsData() {
        return null;
    }
}