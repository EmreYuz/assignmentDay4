package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player(1, "123456789", "Emre", "Yüz", 1982);
        Game game1 = new Game(1, "CS:GO");
        Game game2 = new Game(2, "Age Of Empires");
        Campaign campaign = new Campaign(1,"Yeni Üyelik", "Yeni üye olana ilk oyun %50 indirimli!");

        PlayerManager playerManager = new PlayerManager(new ValidationManager());
        playerManager.signUp(player);



        SellingManager sellingManager = new SellingManager();
        sellingManager.buyWithCampaign(campaign, player, game1);
        sellingManager.buyWithoutCampaign(player, game2);

        playerManager.update(player);
        playerManager.delete(player);
    }
}
