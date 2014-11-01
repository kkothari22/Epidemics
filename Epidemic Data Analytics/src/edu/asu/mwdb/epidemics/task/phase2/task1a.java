package edu.asu.mwdb.epidemics.task.phase2;

import java.text.DecimalFormat;

import edu.asu.mwdb.epidemics.similarity.DTWSimilarity;
import edu.asu.mwdb.epidemics.similarity.EuclideanSimilarity;
import edu.asu.mwdb.epidemics.similarity.Similarity;

public class task1a {
	public static void main(String args[]) throws Exception{
		Similarity sim = new EuclideanSimilarity();
		String file1 = args[0];
		String file2 = args[1];
		float similarity  = sim.getScore(file1, file2);
		DecimalFormat df = new DecimalFormat("#.#########");
		System.out.println("Euclidean Similarity is : "+ df.format(similarity));
	}
}
