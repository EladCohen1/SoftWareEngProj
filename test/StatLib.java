package test;

public class StatLib {

	// simple average
	public static float avg(float[] x) {
		int counter = 0;
		float sum = 0;
		for (float f : x) {
			sum = sum + f;
			counter++;
		}
		return sum / counter;
	}

	// returns the variance of X and Y
	public static float var(float[] x) {
		float[] xSquared = new float[x.length];
		for (int i = 0; i < xSquared.length; i++) {
			xSquared[i] = x[i] * x[i];
		}
		return StatLib.avg(xSquared) - (StatLib.avg(x) * StatLib.avg(x));
	}

	// returns the covariance of X and Y
	public static float cov(float[] x, float[] y) {
		return 0;
	}

	// returns the Pearson correlation coefficient of X and Y
	public static float pearson(float[] x, float[] y) {
		return 0;
	}

	// performs a linear regression and returns the line equation
	public static Line linear_reg(Point[] points) {
		return null;
	}

	// returns the deviation between point p and the line equation of the points
	public static float dev(Point p, Point[] points) {
		return 0;
	}

	// returns the deviation between point p and the line
	public static float dev(Point p, Line l) {
		return 0;
	}

}
