/**
 * Copyright (c) 2014-2015 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.library;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.items.ItemFactory;
import org.eclipse.smarthome.core.library.items.ColorItem;
import org.eclipse.smarthome.core.library.items.ContactItem;
import org.eclipse.smarthome.core.library.items.DateTimeItem;
import org.eclipse.smarthome.core.library.items.DimmerItem;
import org.eclipse.smarthome.core.library.items.ImageItem;
import org.eclipse.smarthome.core.library.items.LocationItem;
import org.eclipse.smarthome.core.library.items.NumberItem;
import org.eclipse.smarthome.core.library.items.PlayerItem;
import org.eclipse.smarthome.core.library.items.RollershutterItem;
import org.eclipse.smarthome.core.library.items.StringItem;
import org.eclipse.smarthome.core.library.items.SwitchItem;

/**
 * {@link CoreItemFactory}-Implementation for the core ItemTypes
 *
 * @author Thomas.Eichstaedt-Engelen
 * @author Kai Kreuzer
 */
public class CoreItemFactory implements ItemFactory {

    public static final String SWITCH = "Switch";
    public static final String ROLLERSHUTTER = "Rollershutter";
    public static final String CONTACT = "Contact";
    public static final String STRING = "String";
    public static final String NUMBER = "Number";
    public static final String DIMMER = "Dimmer";
    public static final String DATETIME = "DateTime";
    public static final String COLOR = "Color";
    public static final String IMAGE = "Image";
    public static final String PLAYER = "Player";
    public static final String LOCATION = "Location";

    /**
     * @{inheritDoc
     */
    @Override
    public GenericItem createItem(String itemTypeName, String itemName) {
        if (SWITCH.equals(itemTypeName))
            return new SwitchItem(itemName);
        if (ROLLERSHUTTER.equals(itemTypeName))
            return new RollershutterItem(itemName);
        if (CONTACT.equals(itemTypeName))
            return new ContactItem(itemName);
        if (STRING.equals(itemTypeName))
            return new StringItem(itemName);
        if (NUMBER.equals(itemTypeName))
            return new NumberItem(itemName);
        if (DIMMER.equals(itemTypeName))
            return new DimmerItem(itemName);
        if (DATETIME.equals(itemTypeName))
            return new DateTimeItem(itemName);
        if (COLOR.equals(itemTypeName))
            return new ColorItem(itemName);
        if (IMAGE.equals(itemTypeName))
            return new ImageItem(itemName);
        if (PLAYER.equals(itemTypeName))
            return new PlayerItem(itemName);
        if (LOCATION.equals(itemTypeName))
            return new LocationItem(itemName);
        else
            return null;
    }

    /**
     * @{inheritDoc
     */
    @Override
    public String[] getSupportedItemTypes() {
        return new String[] { SWITCH, ROLLERSHUTTER, CONTACT, STRING, NUMBER, DIMMER, DATETIME, COLOR, IMAGE, PLAYER,
                LOCATION };
    }

}
