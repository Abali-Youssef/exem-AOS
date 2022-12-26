package com.example.customerservice.commands.agregates;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Client {
    @EntityId
    private String id;
    private String nom;
    private String addresse;
    private String mail;
    private String tel;

}
