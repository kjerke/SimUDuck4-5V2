/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version5;

/**
 *
 * @author kevinjerke
 */
public interface QuackGroup extends DuckGroup {
    public abstract void performQuack();
    public abstract void setQuackBehavior(QuackBehavior qb);
}
