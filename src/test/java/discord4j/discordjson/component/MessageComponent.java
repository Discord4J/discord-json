/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.discordjson.component;

import discord4j.discordjson.json.ComponentData;

/**
 * A Discord message component.
 *
 * @see
 * <a href="https://discord.com/developers/docs/interactions/message-components#message-components">Message Components</a>
 */
public class MessageComponent {

    /**
     * Constructs a {@code MessageComponent} from raw data.
     * <p>
     * The correct subtype will be chosen based on the component's {@link Type}.
     *
     * @param data The raw component data.
     * @return A component with the given data.
     */
    public static MessageComponent fromData(ComponentData data) {
        switch (Type.of(data.type())) {
            case ACTION_ROW: return new ActionRow(data);
            case BUTTON: return new Button(data);
            default: return new MessageComponent(data);
        }
    }

    private final ComponentData data;

    MessageComponent(ComponentData data) {
        this.data = data;
    }

    /**
     * Gets the data of the component.
     *
     * @return The data of the component.
     */
    public ComponentData getData() {
        return data;
    }

    /**
     * Gets the type of the component.
     *
     * @return The type of the component.
     */
    public Type getType() {
        return Type.of(data.type());
    }

    public enum Type {
        UNKNOWN(-1),
        ACTION_ROW(1),
        BUTTON(2),
        SELECT_MENU(3),
        TEXT_INPUT(4),
        SELECT_MENU_USER(5),
        SELECT_MENU_ROLE(6),
        SELECT_MENU_MENTIONABLE(7),
        SELECT_MENU_CHANNEL(8);

        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Type of(int value) {
            switch (value) {
                case 1: return ACTION_ROW;
                case 2: return BUTTON;
                case 3: return SELECT_MENU;
                case 4: return TEXT_INPUT;
                case 5: return SELECT_MENU_USER;
                case 6: return SELECT_MENU_ROLE;
                case 7: return SELECT_MENU_MENTIONABLE;
                case 8: return SELECT_MENU_CHANNEL;
                default: return UNKNOWN;
            }
        }
    }

}
