$reportDirectory = "build/reports"
$reportFile = "$reportDirectory/seminar-summary.txt"

# TODO для учеников:
# Попробуйте понять, чем PowerShell-скрипт похож на bash-скрипт.

New-Item -ItemType Directory -Force -Path $reportDirectory | Out-Null

$sourceFiles = (Get-ChildItem -Recurse -File src | Measure-Object).Count
$runNumber = if ($env:GITHUB_RUN_NUMBER) { $env:GITHUB_RUN_NUMBER } else { "local" }

@(
    "Student template report"
    "Project: student-template"
    "Source files: $sourceFiles"
    "Workflow run number: $runNumber"
) | Set-Content -Path $reportFile

Write-Host "Summary file created: $reportFile"
