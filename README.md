# Java Astronomy Events App

## Overview
The **Java Astronomy Events App** is a simple Java application that displays astronomical events occurring within the past three months and the next three months. This application parses event data from a JSON file and provides an easy way to check for celestial events like eclipses, meteor showers, and comet sightings based on date and time.

---

## Features
- **Date Range Filtering**: Displays events from three months ago to three months ahead.
- **JSON Data Integration**: Reads event data from a JSON file for flexibility.
- **Console Output**: Provides an intuitive output of events.

---

## Prerequisites
- **Java 17 or higher**
- **Gradle**
- **Docker** (optional for containerization)

---

## Project Structure
```
AstronomyApp/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── astronomy/
│       │           ├── AstronomyApp.java
│       │           ├── EventFetcher.java
│       │           └── Event.java
│       └── resources/
│           └── events.json
├── Dockerfile
├── .gitignore
├── build.gradle
└── README.md
```

---

## Usage

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/AstronomyApp.git
cd AstronomyApp
```

### 2. Build the Application
```bash
./gradle build
```

### 3. Run the Application
```bash
gradle run
```

### 4. Sample Output
```plaintext
Astronomical events from 2024-10-17 to 2025-04-17:
Event: Lunar Eclipse at 2024-10-15T20:00:00
Event: Comet Sighting at 2024-12-01T22:30:00
Event: Solar Eclipse at 2025-01-26T12:00:00
Event: Meteor Shower at 2025-02-14T23:00:00
```

---

## Docker Integration

### Build Docker Image
```bash
docker build -t astronomy-app .
```

### Run Docker Container
```bash
docker run --rm astronomy-app
```

---

## How It Works
1. **Event Data**: The application loads data from `events.json` in the `resources` directory.
2. **Date Filtering**: The application calculates a date range (3 months back and forward from the current date).
3. **Display Results**: The filtered results are displayed in the console.

---

## Dependencies
- **Gson**: For parsing JSON data.

```gradle
dependencies {
    implementation 'com.google.code.gson:gson:2.10.1'
}
```

---

## Author
Created by [M.Tayyab](https://github.com/M-Tayyab06).
