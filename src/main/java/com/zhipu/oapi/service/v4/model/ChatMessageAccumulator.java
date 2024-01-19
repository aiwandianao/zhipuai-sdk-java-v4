package com.zhipu.oapi.service.v4.model;

/**
 * Class that accumulates chat messages and provides utility methods for
 * handling message chunks and function calls within a chat stream. This
 * class is immutable.
 *
 * @author [Your Name]
 */
public class ChatMessageAccumulator {

//    private final ChatMessage messageChunk;
    private final ChatMessage accumulatedMessage;

    private final Delta delta;

    private final Choice choice;

    private final Usage usage;

    /**
     * Constructor that initializes the message chunk and accumulated message.
     *
     * @param
     * @param accumulatedMessage The accumulated message.
     */
//    public ChatMessageAccumulator(ChatMessage messageChunk, ChatMessage accumulatedMessage) {
//        this.messageChunk = messageChunk;
//        this.accumulatedMessage = accumulatedMessage;
//    }

    public ChatMessageAccumulator(Delta delta, ChatMessage accumulatedMessage,Choice choice,Usage usage) {
        this.delta = delta;
        this.accumulatedMessage = accumulatedMessage;
        this.choice = choice;
        this.usage = usage;
    }


    /**
     * Checks if the accumulated message contains a function call.
     *
     * @return true if the accumulated message contains a function call, false otherwise.
     */

    /**
     * Retrieves the message chunk.
     *
     * @return the message chunk.
     */
//    public ChatMessage getMessageChunk() {
//        return messageChunk;
//    }

    public Delta getDelta() {
        return delta;
    }

    /**
     * Retrieves the accumulated message.
     *
     * @return the accumulated message.
     */
    public ChatMessage getAccumulatedMessage() {
        return accumulatedMessage;
    }


    public Choice getChoice() {
        return choice;
    }

    public Usage getUsage() {
        return usage;
    }

    /**
     * Retrieves the function call from the message chunk.
     * This is equivalent to getMessageChunk().getFunctionCall().
     *
     * @return the function call from the message chunk.
     */
//    public ChatFunctionCall getChatFunctionCallChunk() {
//        return getMessageChunk().getFunctionCall();
//    }

    /**
     * Retrieves the function call from the accumulated message.
     * This is equivalent to getAccumulatedMessage().getFunctionCall().
     *
     * @return the function call from the accumulated message.
     */
    public ChatFunctionCall getAccumulatedChatFunctionCall() {
        return getAccumulatedMessage().getFunctionCall();
    }


}