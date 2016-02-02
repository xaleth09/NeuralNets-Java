/**
 * @author Roberto Garza
 */

import java.io.FileNotFoundException;
import java.util.Random;

public class NeuralNetLearner {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
    /*    int[] layers = { 6, 2, 1 }; // three layers
        NeuralNet net = new NeuralNet(layers);
        net.connectAll();

        double[][] inputvs = { { 1, 1, 0, 0, 0, 0 }, { 1, 0, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 0 }, { 1, 0, 0, 0, 1, 0 },
                { 1, 0, 0, 0, 0, 1 }, { 0, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 }, { 0, 1, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 0, 1 }, { 0, 0, 1, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0, 1 },
                { 0, 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 1 } };

        double[][] outputvs = { { 0 }, { 0 }, { 1 }, { 1 }, { 1 }, { 0 },
                { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 1 }, { 0 }, { 0 }, { 0 } };

        for (int n = 0; n < 3; ++n) {
            net.train(inputvs, outputvs, 1);
        }

       net.errorrate(inputvs, outputvs);
  
        System.out.println("============================");

        int[] layers2 = { 2, 2 }; // two layers
        NeuralNet net2 = new NeuralNet(layers2);
        net2.connectAll();

        double[][] inputvs2 = { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 0 } };
        double[][] outputvs2 = { { 0, 0 }, { 0, 1 }, { 1, 1 }, { 0, 1 } };

        for (int n = 0; n < 400; ++n) {
            net2.train(inputvs2, outputvs2, 1);
        }
        
        net2.errorrate(inputvs2, outputvs2);
    
        System.out.println("============================");

        DataProcessor data = new DataProcessor("crx.data.training");
        int[] layers3 = { 15, 30, 1 }; // three layers
        NeuralNet net3 = new NeuralNet(layers3);
        net3.connectAll();
        
        double[][] inputvs3 = data.m_inputvs;
        double[][] outputvs3 = data.m_outputvs;

        for (int n = 0; n < 100; ++n) {
            net3.train(inputvs3, outputvs3, 3);

            double error = net3.error(inputvs3, outputvs3);
            System.out.println("error is " + error);
        }
        
        net3.errorrate(inputvs3, outputvs3);
 */       
        System.out.println("============================");
        
        DataProcessor bubil = new DataProcessor("BUBIL.testing", 1);
        int[] layers4 = { 4, 40, 1 }; // three layers
        NeuralNet net4 = new NeuralNet(layers4);
        net4.connectAll();
        
        double[][] inputvs4 = bubil.m_inputvs;
        double[][] outputvs4 = bubil.m_outputvs;

        for (int n = 0; n < 100; ++n) {
            net4.train(inputvs4, outputvs4, 3);

            double error = net4.error(inputvs4, outputvs4);
            System.out.println("error is " + error);
        }
        
        net4.errorrate(inputvs4, outputvs4);

        System.out.println("============================");
 /*       
        DataProcessor lenses = new DataProcessor("lenses.training", 1.0);
        int[] layers5 = { 4, 40, 1 }; // three layers
        NeuralNet net5 = new NeuralNet(layers5);
        net5.connectAll();
        
        double[][] inputvs5 = lenses.m_inputvs;
        double[][] outputvs5 = lenses.m_outputvs;

        for (int n = 0; n < 100; ++n) {
            net5.train(inputvs5, outputvs5, 3);

            double error = net5.error(inputvs5, outputvs5);
            System.out.println("error is " + error);
        }
        
        net5.errorrate(inputvs5, outputvs5);
  */      
        return;
    }

}
