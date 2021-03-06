package io.github.nosequel.practice.match.result;

import io.github.nosequel.practice.kit.Kit;
import io.github.nosequel.practice.match.MatchParticipant;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface MatchResult<T extends MatchParticipant<?>> {

    /**
     * Get a winner of a match
     *
     * @return the winner
     */
    T getWinner();

    /**
     * Set the winner of a match
     *
     * @param winner the winner
     */
    void setWinner(T winner);

    /**
     * Get the loser of a match
     *
     * @return the loser
     */
    T getLoser();

    /**
     * Set the loser of a match
     *
     * @param loser the loser
     */
    void setLoser(T loser);

    /**
     * Get the hit map of the players
     *
     * @return the hit map
     */
    Map<Player, Integer> getHits();

    /**
     * Get the inventory map of the result
     *
     * @return the map
     */
    Map<Player, List<ItemElement>> getInventories();

    /**
     * Get the amount of hits a player had
     *
     * @param player the player
     * @return the amount of hits
     */
    Integer getHits(Player player);

    /**
     * Get the amount of potions a player had in their inventory
     *
     * @param player the player
     * @return the amount of potions
     */
    Integer getPotions(Player player);

    /**
     * Get the inventory of a player
     *
     * @param player the player
     * @return the inventory
     */
    List<ItemElement> getInventory(Player player);

    /**
     * Handle the death of a player
     *
     * @param player the player
     */
    void handleDeath(Player player);

    /**
     * Save the inventory of a player
     *
     * @param player the player
     */
    void saveInventory(Player player);

    /**
     * Get the time the match has started
     *
     * @return the time in epoch
     */
    long getStartEpoch();

    /**
     * Get the time the match had ended
     *
     * @return the time in epoch
     */
    long getEndEpoch();

    /**
     * Check whether a player is in a match result
     *
     * @param player the player
     * @return whether they in the result
     */
    boolean hasPlayer(Player player);

    /**
     * Check whether a player is in a match result
     *
     * @param uuid the player
     * @return whether they are in the result
     */
    boolean hasPlayer(UUID uuid);

    /**
     * Get the unique identifier of a match result
     *
     * @return the unique identifier
     */
    UUID getMatchUniqueId();

    /**
     * Get the kit of the match result
     *
     * @return the kit
     */
    Kit getKit();

}