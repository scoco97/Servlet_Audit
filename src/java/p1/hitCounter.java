/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Yash Jain
 */
public class hitCounter {

    private int hitCount;

    public hitCounter(int hitCount) {
        this.hitCount = hitCount;
    }

    public int getHitCount() {
    return ++hitCount;
    }
}
