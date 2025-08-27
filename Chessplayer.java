
interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up , down");
    }
}

class Rock implements Chessplayer {
    public void moves() {
        System.out.println("up , down");
    }
}
