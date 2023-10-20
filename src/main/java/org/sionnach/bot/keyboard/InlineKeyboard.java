package org.sionnach.bot.keyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboard {

    public static InlineKeyboardMarkup serviceKeyboard() {
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Поиск по ингредиентам");
        inlineKeyboardButton1.setCallbackData("/ingredients");
        rowInline1.add(inlineKeyboardButton1);
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("Поиск по названию блюда");
        inlineKeyboardButton2.setCallbackData("/name");
        rowInline1.add(inlineKeyboardButton2);

        rowsInline.add(rowInline1);

        markupInline.setKeyboard(rowsInline);

        return markupInline;
    }
}