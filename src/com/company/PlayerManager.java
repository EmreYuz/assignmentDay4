package com.company;

public class PlayerManager implements PlayerService{

    ValidationService validationService;

    public PlayerManager(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public void signUp(Player player) {
        if (validationService.validate(player)){
            System.out.println("Oyuncu kaydoldu: " +player.getFirstName()+" "+player.getLastName());
        }else {
            System.out.println("Oyuncunun doğrulaması başarısız!");
        }

    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncunun bilgileri güncellendi: " +player.getFirstName()+" "+player.getLastName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi: " +player.getFirstName()+" "+player.getLastName());
    }
}
