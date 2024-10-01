def call(){
  bat "date /T"
}
//. On Windows, the date command expects user input for setting the date, but in a Jenkins pipeline, interactive prompts won't work since the pipeline runs in a non-interactive shell.
//To fix this, you can use date /T in the bat command to print the current date without prompting for input:
