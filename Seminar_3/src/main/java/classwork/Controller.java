package classwork;


import homework.StreamService;

public class Controller {
    private LearnGroupService learnGroupService;

    public Controller() {
        learnGroupService = new LearnGroupService();
    }

    public LearnGroupService getLearnGroupService() {
        return learnGroupService;
    }

    public void setLearnGroupService(LearnGroupService learnGroupService) {
        this.learnGroupService = learnGroupService;
    }

    public void remove(String name) {
        learnGroupService.remove(name);
    }

    public void sort() {
        learnGroupService.sortStudent();
    }

    public void sortComparator() {
        learnGroupService.sortName();
    }
}
