package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double x1 = 0;
		double y1 =0;
		double x2 =1;
		double y2=0;
		double x3 = 1;
		double y3 = 0.6;
		double x4 = 0.4;
		double y4 =0.6;
		double x5=0.4;
		double y5 = 0.4;
		double x6 =0;
		double y6 =0.4;
		double x7 = 0;
		double y7 = 0.6;
		double[] bluex = {x1,x2,x3,x4,x5,x6,x7};
		double[] bluey = {y1,y2,y3,y4,y5,y6,y7};
		StdDraw.setPenColor(65,105,225);
		StdDraw.filledPolygon(bluex,bluey);
		double bandx=0.725;
		double bandy=0.3;
		double halfWidth = 0.08;
		double halfheight = 0.3;
		StdDraw.setPenColor(238,180,34);
		StdDraw.filledRectangle(bandx,bandy,halfWidth,halfheight);
		double cx1=0.1;
		double cy1=0.6;
		double cx2 = 0.18;
		double cy2=0.6;
		double cx4 = 0.26;
		double cy4= 0.54;
		double cx5 = 0.26;
		double cy5 = 0.48;
		double cx7 = 0.18;
		double cy7 = 0.41;
		double cx8 = 0.1;
		double cy8 = 0.41;
		double cx10 = 0.02;
		double cy10 = 0.48;
		double cx11 = 0.02;
		double cy11 = 0.54;
		double cx12 = 0.1;
		double cy12 = 0.54;
		double cx3 = 0.18;
		double cy3 = 0.54;
		double cx9 = 0.1;
		double cy9 = 0.48;
		double cx6 = 0.18;
		double cy6 = 0.48;
		double[] cxx= {cx1,cx2,cx3,cx4,cx5,cx6,cx7,cx8,cx9,cx10,cx11,cx12};
		double[] cyy = {cy1,cy2,cy3,cy4,cy5,cy6,cy7,cy8,cy9,cy10,cy11,cy12};
		StdDraw.setPenColor(238,180,34);
		StdDraw.filledPolygon(cxx,cyy);
		
	}
}