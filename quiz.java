public class quiz {
    private String country;

    public quiz(String country_){
        country = country_;
        switch (country) {
            case "southSudan" -> southSudanQuiz();
            case "cambodia" -> cambodiaQuiz();
        }
    }
    public void southSudanQuiz(){
        MainMenu.southSudanComplete = true;
        new MainMenu();
    }
    public void cambodiaQuiz(){
        MainMenu.cambodiaCopmlete = true;
        new MainMenu();
    }
}
