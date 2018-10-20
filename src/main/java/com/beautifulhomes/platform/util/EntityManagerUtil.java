/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beautifulhomes.platform.util;

import javax.persistence.EntityManager;

/**
 *
 * @author dong
 */
public class EntityManagerUtil {
    private static EntityManager entityManager; 

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManager) {
        EntityManagerUtil.entityManager = entityManager;
    }
    public static void closeEntityManager() {
        if(EntityManagerUtil.entityManager != null && EntityManagerUtil.entityManager.isOpen()){
            EntityManagerUtil.entityManager.close();
        }
        EntityManagerUtil.entityManager = null;
    }
}
