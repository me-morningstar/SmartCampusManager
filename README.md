# Smart Campus Logistics & Resource Manager

A Java-based desktop application engineered to manage university assets, track resource allocations, and handle booking logistics across campus departments.

---

## Project Overview
The Smart Campus Logistics & Resource Manager simplifies asset tracking for academic institutions. It provides role-based user management, dynamic availability updates, double-booking prevention, and persistent storage to track shared facilities like AI labs, multimedia projectors, and seminar halls.

---

## Key Features
* **User Role Management:** Differentiates permissions and interactions for Students, Faculty, and Administrators.
* **Resource Allocation Engine:** Enables real-time booking and returning of campus assets while preventing double-booking conflicts.
* **Persistent Storage:** Saves and retrieves live asset availability states to a flat-file database (`data/resources.txt`).
* **Automated Unit Testing:** Includes a dedicated test runner script (`TestRunner.java`) to validate system logic and constraints.

---

## Technical Stack
* **Language:** Java (JDK 17 or higher)
* **Architecture:** Object-Oriented Programming (OOP)
* **Storage:** Java File I/O (`BufferedReader`, `BufferedWriter`)
* **Environment:** Command-Line Interface (CLI)

---

## Installation & Running Instructions

### Prerequisites: # Smart Campus Logistics & Resource Manager

A Java-based desktop application engineered to manage university assets, track resource allocations, and handle booking logistics across campus departments[cite: 1].

---

## Project Overview
The Smart Campus Logistics & Resource Manager simplifies asset tracking for academic institutions[cite: 1]. It provides role-based user management, dynamic availability updates, double-booking prevention, and persistent storage to track shared facilities like AI labs, multimedia projectors, and seminar halls[cite: 1].

---

## Key Features
* **User Role Management:** Differentiates permissions and interactions for Students, Faculty, and Administrators[cite: 1].
* **Resource Allocation Engine:** Enables real-time booking and returning of campus assets while preventing double-booking conflicts[cite: 1].
* **Persistent Storage:** Saves and retrieves live asset availability states to a flat-file database (`data/resources.txt`)[cite: 1].
* **Automated Unit Testing:** Includes a dedicated test runner script (`TestRunner.java`) to validate system logic and constraints[cite: 1].

---

## Technical Stack
* **Language:** Java (JDK 17 or higher)
* **Architecture:** Object-Oriented Programming (OOP)
* **Storage:** Java File I/O (`BufferedReader`, `BufferedWriter`)
* **Environment:** Command-Line Interface (CLI)

---

## Installation & Running Instructions
### 1.Check if Java is Installed
Before running the project, verify whether the Java Development Kit (JDK) is already installed on your computer:
1. Open **Command Prompt** (Windows) or **Terminal** (macOS/Linux).
2. Type the following command and press **Enter**:
   ```bash
   javac -version
### 2.If Java not installed
Option A: Windows
- Download the JDK 17 or JDK 21 Installer from Oracle Java Downloads or Eclipse Adoptium (Temurin).
- Run the downloaded .exe installer file.
- Follow the installation wizard prompts, accepting the default options.
- Set Environment Path (If needed):
- Search for "Edit the system environment variables" in the Windows Start menu.
- Click Environment Variables.
- Under System Variables, select Path and click Edit.
- Click New and add the path to your Java bin directory (e.g., C:\Program Files\Java\jdk-17\bin).
- Click OK on all windows.
- Close and reopen your Command Prompt, then verify by running javac -version.

Option B: macOS
- Using Homebrew: Open Terminal and run:
Bash
brew install openjdk@17
- Manual Installer: Download the macOS .dmg installer from Oracle Java Downloads or Adoptium and run the installer pkg.

Option C: Linux (Ubuntu / Debian)
Open your terminal and execute:
Bash
sudo apt update
sudo apt install openjdk-17-jdk -y

---

## Screenshots
<img width="1057" height="342" alt="Screenshot 2026-09-18 015400" src="https://github.com/user-attachments/assets/672b3184-3dc2-463b-9e46-741d6c3bbf88" />
<img width="862" height="245" alt="Screenshot 2026-09-18 015420" src="https://github.com/user-attachments/assets/969d97ef-16d4-4692-9eda-d6f8c953ade7" />
<img width="646" height="240" alt="Screenshot 2026-09-18 015426" src="https://github.com/user-attachments/assets/433218d8-8508-4ee6-a0d4-73d81dbd5bbf" />
<img width="677" height="290" alt="Screenshot 2026-09-18 015435" src="https://github.com/user-attachments/assets/5c13d3ab-7a79-4102-9a84-3212f3badccc" />
<img width="1103" height="282" alt="Screenshot 2026-09-18 015440" src="https://github.com/user-attachments/assets/6599f674-6004-4d76-ae0c-9561138b3a18" />
