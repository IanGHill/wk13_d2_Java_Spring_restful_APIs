package com.example.codeclan.filesfolders.components;

import com.example.codeclan.filesfolders.models.File;
import com.example.codeclan.filesfolders.models.Folder;
import com.example.codeclan.filesfolders.models.User;
import com.example.codeclan.filesfolders.repositories.FileRepository;
import com.example.codeclan.filesfolders.repositories.FolderRepository;
import com.example.codeclan.filesfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
  private FileRepository fileRepository;

  @Autowired
  private FolderRepository folderRepository;

  @Autowired
  private UserRepository userRepository;

  public void run(ApplicationArguments args){
    fileRepository.deleteAll();
    folderRepository.deleteAll();
    userRepository.deleteAll();

    User user1 = new User("Ian");
    userRepository.save(user1);
    User user2 = new User("Dave");
    userRepository.save(user2);

    Folder folder1 = new Folder("Programs", user1);
    folderRepository.save(folder1);
    Folder folder2 = new Folder("Executables", user1);
    folderRepository.save(folder2);
    Folder folder3 = new Folder("Essays", user2);
    folderRepository.save(folder3);
    Folder folder4 = new Folder("Exams", user2);
    folderRepository.save(folder4);

    File file1 = new File("file1","jpg",31,folder1);
    File file2 = new File("file2","jpg",32,folder1);
    File file3 = new File("file3","jpg",33,folder1);
    fileRepository.save(file1);
    fileRepository.save(file2);
    fileRepository.save(file3);

    File file4 = new File("file4","jpg",34,folder2);
    File file5 = new File("file5","jpg",35,folder2);
    File file6 = new File("file6","jpg",36,folder2);
    fileRepository.save(file4);
    fileRepository.save(file5);
    fileRepository.save(file6);

    File file7 = new File("file7","jpg",37,folder3);
    File file8 = new File("file8","jpg",38,folder3);
    File file9 = new File("file9","jpg",39,folder3);
    fileRepository.save(file7);
    fileRepository.save(file8);
    fileRepository.save(file9);

    File file10 = new File("file10","jpg",40,folder4);
    File file11 = new File("file11","jpg",41,folder4);
    File file12 = new File("file12","jpg",42,folder4);
    fileRepository.save(file10);
    fileRepository.save(file11);
    fileRepository.save(file12);

  }

//    Ship dutchman = new Ship("The Flying Dutchman");
//    shipRepository.save(dutchman);
//    Ship pearl = new Ship("The Black Pearl");
//    shipRepository.save(pearl);
//    Ship blackPig = new Ship("The Black Pig");
//    shipRepository.save(blackPig);
}
