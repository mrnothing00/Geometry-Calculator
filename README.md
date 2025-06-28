# Geometry Calculator 📐

A simple Java console app that lets users **compute areas and volumes** of common 2-D and 3-D shapes in a menu-driven loop.  
Great as an OOP practice project to showcase on your GitHub portfolio.

---

## ✨ Features
| Shape | Method | Formula |
|-------|--------|---------|
| **Circle** | `calculateArea()` | π r² |
| **Rectangle** | `calculateArea()` | l × w |
| **Triangle** | `calculateArea()` | ½ b h |
| **Cylinder** | `calculateVolume()` | π r² h |
| **Sphere** | `calculateVolume()` | 4/3 π r³ |
| **Cone** | `calculateVolume()` | 1/3 π r² h |
| **Pyramid** | `calculateVolume()` | 1/3 (baseArea) h |

* Object-oriented design: each shape is its own class with getters and a calculation method.  
* Menu lets you enter **multiple instances** (e.g., compute areas for 3 circles in one go).  
* Continuous loop until the user chooses **Exit**.

---

## 🚀 Quick Start

1. **Clone or download** this repository.
2. Compile:
   ```bash
   javac GeometryCalculator.java
