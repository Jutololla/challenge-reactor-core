package com.example.demo.utils;

import com.example.demo.model.Player;
import com.example.demo.modelDto.PlayerDto;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class AppUtils {

    public static PlayerDto playerToDto(Player player) throws InvocationTargetException, IllegalAccessException {
        PlayerDto playerDto = new PlayerDto();
        BeanUtils.copyProperties(player, playerDto);
        return playerDto;
    }

    public static Player dtoToPlayer(PlayerDto playerDto) throws InvocationTargetException, IllegalAccessException {
        Player player = new Player();
        BeanUtils.copyProperties(playerDto, player);
        return player;
    }

}
