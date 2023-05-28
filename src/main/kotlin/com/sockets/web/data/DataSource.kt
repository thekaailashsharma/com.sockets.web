package com.sockets.web.data

/**
 * Interface for a data source handling messages.
 */
interface DataSource {

    /**
     * Retrieves all messages from the data source.
     *
     * @param from optional filter to retrieve messages from a specific sender.
     * @return a list of messages.
     */
    suspend fun getAllMessages(from:String?): List<Message>

    /**
     * Inserts a new message into the data source.
     *
     * @param message the message to insert.
     */
    suspend fun insertMessages(message: Message)
}

interface P2PDataSource{

    /**
     * Retrieves all P2P messages from the data source.
     *
     * @param from optional filter to retrieve messages from a specific sender.
     * @param to optional filter to retrieve messages for a specific recipient.
     * @return a list of P2P messages.
     */
    suspend fun getAllMessages(from: String?, to: String?): List<P2PMessage>?

    /**
     * Retrieves all location messages from the data source.
     *
     * @param from optional filter to retrieve location messages from a specific sender.
     * @return a list of location messages.
     */
    suspend fun getLocationMessage(from: String?): List<LocationMessage>?

    /**
     * Inserts a new P2P message into the data source.
     *
     * @param message the P2P message to insert.
     */
    suspend fun insertMessages(message: P2PMessage)

    /**
     * Inserts a new location message into the data source.
     *
     * @param location the location message to insert.
     */
    suspend fun insertLocation(location: LocationMessage)

}