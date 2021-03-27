package com.ua.lemon.MishchenkoDmytro.Figures;

public class MainFigures {
    public static void main(String[] args) {
        FigureLS6 r1 = new RoundLS6();
        FigureLS6 s1 = new SquareLS6();
        FigureLS6 t1 = new TriangleLS6();

        FigureLS6[] figure = new FigureLS6[3];

        figure[0] = r1;
        figure[1] = t1;
        figure[2] = s1;

        for (int i = 0; i < 3; i++) {
            figure[i].sayMyName();
        }


    }
}
