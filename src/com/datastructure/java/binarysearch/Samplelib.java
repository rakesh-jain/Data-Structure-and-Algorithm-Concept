package com.datastructure.java.binarysearch;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Samplelib {
    public static void main(String[] args) {
        String[] strArr = {"[1, 2, 3]", "[4, 5, 6]", "[7, 8, 9]"};
//        System.out.println(MatrixChallenge(strArr));  // Output: 1,2,3,6,9,8,7,4,5
    }

////        String filePath = "C:/Users/Rakesh R/OneDrive/Desktop/spring-boot-login-mongodb-master/src/main/resources/mail.html";
////        File file = new File(filePath);
////
////
////        if (file.exists()) {
////            System.out.println("File exists.");
////        } else {
////            System.out.println("File does not exist.");
////        }
//        String name="rakesh";
//        String mail="djfhdfsahsdfh";
//        String htmlContent="<!DOCTYPE html>\n" +
//                "<html xmlns:th=\"http://www.w3.org/1999/xhtml\">\n" +
//                "<head>\n" +
//                "    <style>\n" +
//                "        body {\n" +
//                "            font-family: Arial, sans-serif;\n" +
//                "            background-color:black;\n" +
//                "            /* color: #f9f9f9; */\n" +
//                "        }\n" +
//                "        .container{\n" +
//                "            background-color: rgb(10, 4, 36);\n" +
//                "            color: aliceblue;\n" +
//                "            width: 80%;\n" +
//                "            margin: 0 auto;\n" +
//                "            padding: 20px;\n" +
//                "            border: 1px solid #121010;\n" +
//                "            border-radius: 5px;\n" +
//                "            /* background-color: #f9f9f9; */\n" +
//                "        }\n" +
//                "        .header {\n" +
//                "            text-align: center;\n" +
//                "            /* color: #333; */\n" +
//                "            color: aliceblue;\n" +
//                "        }\n" +
//                "        .content {\n" +
//                "            margin-top: 20px;\n" +
//                "            line-height: 1.6;\n" +
//                "        }\n" +
//                "        .footer {\n" +
//                "            margin-top: 30px;\n" +
//                "            text-align: center;\n" +
//                "            color: #777;\n" +
//                "        }\n" +
//                "    </style>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "<div class=\"container\">\n" +
//                "    <h2 class=\"header\">Registration Confirmation</h2>\n" +
//                "    <div class=\"content\">\n" +
//                "        <p>Dear <span th:text=${username}></span>,</p>\n" +
//                "        <p>Thank you for registering with [Your Company Name]! We are excited to have you on board.</p>\n" +
//                "        <p>Here is a summary of your registration details:</p>\n" +
//                "        <ul>\n" +
//                "            <li>Username: <span th:text=${username}></span></li>\n" +
//                "            <li>Email: <span th:text= ${mail}></span></li>\n" +
//                "            <li>Registration Date:<span th:text=${date}></span></li>\n" +
//                "        </ul>\n" +
//                "        <p>If you have any questions or concerns, please don't hesitate to contact us at <span th:text=\"${username}\"></span>.</p>\n" +
//                "        <p>Best regards,</p>\n" +
//                "        <p>[Your Name]</p>\n" +
//                "        <p>[Your Company Name]</p>\n" +
//                "    </div>\n" +
//                "    <div class=\"footer\">\n" +
//                "        <p>[Your Company Name] &copy; [Year]</p>\n" +
//                "    </div>\n" +
//                "</div>\n" +
//                "</body>\n" +
//                "</html>";
//        htmlContent=htmlContent.replace("${username}", name).replace("${mail}",mail).replace("${date}",new Date().toString());
//        System.out.println(htmlContent);
    }



//        public static String MatrixChallenge(String[] strArr) {
//            List<Integer> result = new ArrayList<>();
//            int[][] matrix = new int[strArr.length][];
//            for (int i = 0; i < strArr.length; i++) {
//                String[] row = strArr[i].replaceAll("\\[|\\]|\\s", "").split(",");
//                matrix[i] = new int[row.length];
//                for (int j = 0; j < row.length; j++) {
//                    matrix[i][j] = Integer.parseInt(row[j]);
//                }
//            }
//
//            int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
//            int direction = 0; // 0: right, 1: down, 2: left, 3: up
//
//            while (top <= bottom && left <= right) {
//                if (direction == 0) {  // Traverse right
//                    for (int i = left; i <= right; i++) {
//                        result.add(matrix[top][i]);
//                    }
//                    top++;
//                } else if (direction == 1) {  // Traverse down
//                    for (int i = top; i <= bottom; i++) {
//                        result.add(matrix[i][right]);
//                    }
//                    right--;
//                } else if (direction == 2) {  // Traverse left
//                    for (int i = right; i >= left; i--) {
//                        result.add(matrix[bottom][i]);
//                    }
//                    bottom--;
//                } else if (direction == 3) {  // Traverse up
//                    for (int i = bottom; i >= top; i--) {
//                        result.add(matrix[i][left]);
//                    }
//                    left++;
//                }
//                direction = (direction + 1) % 4;  // Update direction
//            }
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < result.size(); i++) {
//                sb.append(result.get(i));
//                if (i < result.size() - 1) {
//                    sb.append(",");
//                }
//            }
//            return sb.toString();
//        }
//






