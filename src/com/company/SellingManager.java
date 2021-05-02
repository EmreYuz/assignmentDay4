package com.company;

public class SellingManager implements SellingService {
    @Override
    public void buyWithCampaign(Campaign campaign, Player player, Game game) {
        System.out.println(game.getGameName() + " oyunu " + player.getFirstName() + " " + player.getLastName() + " tarafından " + campaign.getCampaignName() + " kampanyasıyla satın alındı.");
    }

    @Override
    public void buyWithoutCampaign(Player player, Game game) {
        System.out.println(game.getGameName() + " oyunu " + player.getFirstName() + " " + player.getLastName() + " kampanyasıyla satın alındı.");
    }
}
