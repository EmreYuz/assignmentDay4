package com.company;

public interface SellingService {
    void buyWithCampaign(Campaign campaign, Player player, Game game);
    void buyWithoutCampaign(Player player, Game game);
}
