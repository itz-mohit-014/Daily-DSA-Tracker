const fs = require("fs");
const readline = require("readline");

// current Date
function getFormattedDate() {
  const today = new Date();
  return today.toLocaleDateString("en-US", {
    year: "numeric",
    month: "long",
    day: "numeric",
  });
}

// 🧱 Build the markdown table row
function generateRow(data) {
  return `| ${data.problemNumber}  | ${getFormattedDate()} | ${
    data.platform
  } | [${data.title}](${data.link}) | \`${data.folderPath}\` | \`${
    data.complexity.time
  }\` time, \`${data.complexity.space}\` space | ${data.approach} | ${
    data.remarks
  } |\n`;
}

// 🛠 Insert the row after the table header line
function insertRowIntoReadme(row, readmePath = "README.md") {
  const content = fs.readFileSync(readmePath, "utf-8").split("\n");
  const headerIndex = content.findIndex((line) => line.startsWith("| --- "));
  if (headerIndex !== -1) {
    content.splice(headerIndex + 1, 0, row.trim());
    fs.writeFileSync(readmePath, content.join("\n"));
    console.log("✅ Row added to README.md successfully!");
  } else {
    console.error("❌ Table header not found in README.md.");
  }
}

// 🚀 CLI Prompt
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const questions = [
  "Problem Number: ",
  "Platform (LeetCode/GFG): ",
  "Problem Title: ",
  "Problem Link: ",
  "Solution File Path (e.g., ./Day04/SomeProblem.java): ",
  "Time Complexity: ",
  "Space Complexity: ",
  "Approach Summary: ",
  "Remarks / New Learning: ",
];

const answers = [];

function askQuestion(index = 0) {
  if (index === questions.length) {
    const [
      problemNumber,
      platform,
      title,
      link,
      folderPath,
      time,
      space,
      approach,
      remarks,
    ] = answers;

    const row = generateRow({
      problemNumber,
      platform,
      title,
      link,
      folderPath,
      complexity: {
        time,
        space,
      },
      approach,
      remarks,
    });

    insertRowIntoReadme(row);
    rl.close();
    return;
  }

  rl.question(questions[index], (answer) => {
    answers.push(answer);
    askQuestion(index + 1);
  });
}

askQuestion();
