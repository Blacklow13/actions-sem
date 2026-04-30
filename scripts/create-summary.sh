#!/usr/bin/env bash
set -e

# TODO для учеников:
# 1. Запустить этот скрипт из GitHub Actions.
# 2. Посмотреть, какой файл он создает.
# 3. Сохранить этот файл как artifact.

mkdir -p build/reports

{
  echo "Student template report"
  echo "Project: student-template"
  echo "Source files: $(find src -type f | wc -l)"
  echo "Workflow run number: ${GITHUB_RUN_NUMBER:-local}"
} > build/reports/seminar-summary.txt

echo "Summary file created: build/reports/seminar-summary.txt"
