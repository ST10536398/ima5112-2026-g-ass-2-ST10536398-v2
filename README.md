# Hack Or Myth

**Developer:** Joshua Siwawa  
**Student Number:** ST10536398  
**Course:** Higher Certificate in Mobile Application and Web Development  
**Subject:** Introduction to Mobile Application Development  

---

## Links
- **GitHub Repository:** [https://github.com/ST10536398/ima5112-2026-g-ass-2-ST10536398-v2](https://github.com/ST10536398/ima5112-2026-g-ass-2-ST10536398-v2)

---

## Project Overview
Hack Or Myth is a mobile quiz application developed as part of the IMAD5112 subject. The app was built using **Kotlin** in **Android Studio**. Its primary purpose is to provide an interactive way for users to test their knowledge of everyday life hacks and myths.  

The app presents statements to the user, who must decide whether each statement is a **Hack** (true/useful tip) or a **Myth** (false/misconception). At the end of the quiz, the user receives a score and can review all flashcards with explanations.

This project was designed to meet assignment requirements, including:
- Creating a functional mobile app in Kotlin.
- Using GitHub for version control.
- Structuring the app with multiple activities and layouts.
- Implementing navigation between screens.

---

## Purpose and Features

### Purpose
The main purpose of Hack Or Myth is to **educate and entertain** users by debunking common myths and highlighting useful life hacks in a fun quiz format.

### Key Features
- **Feature 1: Welcome Screen**  
  A simple landing page with a "Start Quiz" button that navigates to the quiz activity.

- **Feature 2: Quiz Functionality**  
  Displays flashcards with statements. Users select whether the statement is a hack or a myth. Immediate feedback is shown.

- **Feature 3: Scoring System**  
  Tracks the user’s score throughout the quiz and passes it to the score activity.

- **Feature 4: Score Screen**  
  Displays the final score with motivational feedback. Includes a "Review Answers" button to show all statements, correct answers, and explanations.

- **Feature 5: Navigation Flow**  
  Smooth transitions between activities:  
  `MainActivity (Welcome)` → `Main3Activity (Quiz)` → `Main4Activity (Score)`.

---

## Design Considerations
The design of Hack Or Myth was guided by the following principles:

- **Ease of Use:**  
  A clean, minimal interface with clear buttons and text ensures the quiz is intuitive.

- **Functionality:**  
  Focused on delivering accurate feedback and explanations to enhance learning.

- **Performance:**  
  Optimized to run smoothly on the emulator and physical devices, with lightweight layouts and efficient Kotlin code.

- **Educational Value:**  
  Each flashcard includes an explanation to reinforce learning and debunk misconceptions.

---

## Technologies Used
- **Language:** Kotlin  
- **IDE:** Android Studio  
- **Frameworks:** Android SDK, AppCompat  
- **Version Control:** GitHub  

---

## How to Run
1. Clone the repository:  
   ```bash
   git clone https://github.com/ST10536398/ima5112-2026-g-ass-2-ST10536398-v2.git
