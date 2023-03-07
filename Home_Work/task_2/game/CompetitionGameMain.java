package Home_Work.task_2.game;

public class CompetitionGameMain {
    public static void main(String[] args) {
        Obstacle[] obstacles = createObstacles();
        Participant[] participants = createParticipants();
        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean result = obstacle.pass(participant);
                if (result) {
                    System.out.println("Участник #" + participant.getName() + " преодолел препятствие");
                } else {
                    System.out.println("Участник #" + participant.getName() + " НЕ преодолел препятствие");
                }
            }
        }
    }

    private static Obstacle[] createObstacles() {
        return new Obstacle[] {
                new WallObstacleAdapter(new Wall(40)),
                new RoadObstacleAdapter(new Road(100)),
                new RoadObstacleAdapter(new Road(45)),
                new SwimmingPollObstacleAdapter(new SwimmingPoll(20)),
                new MontainObstacleAdapter(new Montain(90))
        };
    }

    private static Participant[] createParticipants() {
        return new Participant[] {
                new StandardParticipant("Igor", 50, 30, 20, 100),
                new Cat("Murzik", 60, 25),
                new Cheater("Cheater")
        };
    }
}