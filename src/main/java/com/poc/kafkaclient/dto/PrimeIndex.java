package com.poc.kafkaclient.dto;


import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class PrimeIndex extends AbstractDto{
    private int prime_index;
}
