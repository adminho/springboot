# เป็นตัวอย่าง springboot โปรเจค่างๆ

# วิธีการติดตั้งโปรเจคนี้
1. clone โปรเจคนี้ ด้วยคำสั่ง
```
cd <your_directory>
git clone https://github.com/adminho/springboot.git
```
![alt text](git_clone_command.PNG)
ก็จะได้โฟลเดอร์ <your_directory>/springboot
3. ดับเบิลคลิก lombok.jar -> เลือกไฟล์ Ecplise.exe หรือ SpringToolSuite4.exe ที่จะปลั๊กอิน lombok เข้าไป (ปกติมันจะสแกนหาเจอให้อัตโนมัติ)
![alt text](click_lombok.PNG)
4. ถ้าข้อ 3 ไม่เจอให้เลือก specify location
![alt text](click_lombok_specify_location.PNG)
5. เปิด Ecplise หรือ SpringToolSuite4 -> เลือก Workspace เป็นโฟลเดอร์ <your_directory> ที่เดียวกับข้อ 1 
![alt text](select_workspace.PNG)
6. เลือก File -> เลือก Import
![alt text](file_import.png)
7. จากนั้นเลือก General -> Projects from Folder or Achive -> เสร็จแล้วกด Next
![alt text](select_Projects_form_folder.PNG)
8. เลือก Directory -> เลือกโฟลเดอร์ <your_directory> เพื่อนำเข้าทุกโปรเจค ยกเว้น ข้อ 9
![alt text](select_all_projects.PNG
9. ติ๊กโฟลเดอร์ <your_directory> ออกไป ไม่ import -> เสร็จแล้วกด Finish
![alt text](without_springboot.PNG)
10. รอให้ update โปรเจคจนเสร็จสิ้น (ใช้เวลานานหน่อย)

